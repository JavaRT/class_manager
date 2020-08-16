package classmanager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private int yearBorn;
    private boolean quarantine;
    private Gender gender;



}
