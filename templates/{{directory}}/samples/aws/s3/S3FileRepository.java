package {{directory_path_code}}.samples.aws.s3;

import com.amazonaws.services.s3.AmazonS3Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

@Component
public class S3FileRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(S3FileRepository.class);
    private final AmazonS3Client s3Client;
    private final String bucket;


    public S3FileRepository(
            AmazonS3Client s3Client,
            @Value("${cloud.aws.s3.bucket-name}") String bucket) {
        this.s3Client = s3Client;
        this.bucket = bucket;
    }


    public URL getUrlDownloadObject(String nameObject) {
        boolean exits = s3Client.doesObjectExist(bucket, nameObject);

        if (!exits) {
            LOGGER.error("the object: {} does not exist", nameObject);
            throw new IllegalArgumentException("Object not exist!");
        }
        LOGGER.info("Getting the url of the object: {}", nameObject);

        return s3Client.getUrl(bucket, nameObject);
    }

    public void deleteObject(String nameObject) {
        boolean exits = s3Client.doesObjectExist(bucket, nameObject);

        if (!exits) {
            LOGGER.error("the {} does not exist", nameObject);
            throw new IllegalArgumentException("Object not exist!");
        }

        LOGGER.info("Deleting Object from S3");
        s3Client.deleteObject(bucket, nameObject);
    }

    public void uploadFile(File file) {
        String key = file.getName();
        LOGGER.info("Persisting object:{} in S3", key);

        s3Client.putObject(bucket, key, file);
    }

}
