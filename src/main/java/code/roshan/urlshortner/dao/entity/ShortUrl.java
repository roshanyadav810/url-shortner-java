package code.roshan.urlshortner.dao.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Table(name = "short_url")
public class ShortUrl {
    @Id
    @Column(name = "short_url",nullable = false,updatable = false,length = 6)
    String shortUrl;

    @Column(name = "user_id",nullable = false)
    Long userId;

    @Column(name = "long_url",nullable = false,updatable = false)
    String longUrl;

    @Column(name = "creation_time",nullable = false)
    Long creationTime;

}
