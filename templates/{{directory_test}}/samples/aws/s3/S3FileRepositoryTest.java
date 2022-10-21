package {{directory_path_code}}.samples.aws.s3;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3Client;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import {{directory_path_code}}.samples.aws.s3.base.S3IntegrationTest;

import java.io.File;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class S3FileRepositoryTest extends S3IntegrationTest {
    @Autowired
    private S3FileRepository s3FileRepository;

    @Autowired
    private AmazonS3Client s3Client;

    @Value("${cloud.aws.s3.bucket-name}")
    private String bucket;

    @Value("classpath:/uploads/myreport.txt")
    private File fileToUpload;

    @BeforeEach
    void setUp() {
        s3Client.createBucket(bucket);
    }

    @AfterEach
    void tearDown() {
        s3Client.deleteObject(bucket, fileToUpload.getName());
        s3Client.deleteBucket(bucket);
    }

    @Test
    @DisplayName("must upload the file")
    void t1() {

        String key = fileToUpload.getName();
        s3FileRepository.uploadFile(fileToUpload);

        boolean exist = s3Client.doesObjectExist(bucket, key);

        assertTrue(exist,
                "Deveria existir o arquivo");
    }

    @Test
    @DisplayName("should not upload a non-existent file")
    void t2() {
        //scenary
        String key = "404.txt";

        //action and validation
        SdkClientException sdkClientException = assertThrows(SdkClientException.class, () -> {
            s3FileRepository.uploadFile(new File(key));
        });
        
        assertThat(sdkClientException)
                .hasMessageContaining("Unable to calculate MD5 hash: 404.txt");
    }

    @Test
    @DisplayName("must create the file download url")
    void t3() {
        //scenary
        String key = fileToUpload.getName();
        s3Client.putObject(bucket, key, fileToUpload);

        // action
        URL urlDownloadObject = s3FileRepository.getUrlDownloadObject(key);

        //validation
        assertThat(urlDownloadObject)
                .isNotNull()
                .asString()
                .contains(bucket, key);
    }

    @Test
    @DisplayName("must not create download url for non-existing object")
    void t4() {
        //scenary
        String keyNotExist = "NOT_FOUND";

        //action and validation
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            s3FileRepository.getUrlDownloadObject(keyNotExist);
        });

        assertThat(exception)
                .hasMessageContaining("Object not exist!");
    }

    @Test
    @DisplayName("must delete an object")
    void t5() {
        //scenary
        String key = fileToUpload.getName();
        s3Client.putObject(bucket, key, fileToUpload);

        //action
        s3FileRepository.deleteObject(key);

        //validation
        assertFalse(
                s3Client.doesObjectExist(bucket,key)
        );

    }

    @Test
    @DisplayName("must not delete a non-existent object")
    void t6() {
        //scenary
        String keyNotExist = "NOT_FOUND";

        //action and validation
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            s3FileRepository.deleteObject(keyNotExist);
        });

        assertThat(exception)
                .hasMessageContaining("Object not exist!");

    }
}