package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "AppliedResultR_table")
@Data
public class AppliedResultR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
