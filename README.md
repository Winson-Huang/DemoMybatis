# BasicDemo

Config datasource:

copy `application-secret-example.yml` to `application-secret.yml` and fill information.

Manually create a database BasicDB before start the application, drop the database after stop the application:

```sql
CREATE DATABASE DemomybatisDB;
DROP DATABASE DemomybatisDB;
```

Before start the application, execute `initdb.sql` to create table and insert values:

```bash
mysql -u <username> -p <password> DemomybatisDB < initdb.sql
```

Use other sql script alike.