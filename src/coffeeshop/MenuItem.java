package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//클래스 자료형:Beans(콩들) ->데이터만 가지고 있는 것들 =Table(DB)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
       private String name; 
       private int price;
}
