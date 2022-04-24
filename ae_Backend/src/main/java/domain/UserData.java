package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="USERDATA")
@Getter @Setter
public class UserData {
    @Id
    @Column(name = "user_data_id")
    private Long user_data_id;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "user_id")
    //private User user;
    private String mci_score;
    private String result_date;
    private String mmse_result;

    public Long getUser_data_id() {
        return user_data_id;
    }

    public void setUser_data_id(Long user_data_id) {
        this.user_data_id = user_data_id;
    }

    public String getMci_score() {
        return mci_score;
    }

    public void setMci_score(String mci_score) {
        this.mci_score = mci_score;
    }

    public String getResult_date() {
        return result_date;
    }

    public void setResult_date(String result_date) {
        this.result_date = result_date;
    }

    public String getMmse_result() {
        return mmse_result;
    }

    public void setMmse_result(String mmse_result) {
        this.mmse_result = mmse_result;
    }
}


