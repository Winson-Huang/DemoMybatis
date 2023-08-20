package demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demomybatis.mapper")
public class DemomybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomybatisApplication.class, args);
	}

}
