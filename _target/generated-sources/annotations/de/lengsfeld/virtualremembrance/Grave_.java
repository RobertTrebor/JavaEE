package de.lengsfeld.virtualremembrance;

import de.lengsfeld.virtualremembrance.Cemetery;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-03T19:19:38")
@StaticMetamodel(Grave.class)
public class Grave_ { 

    public static volatile SingularAttribute<Grave, Long> id;
    public static volatile SingularAttribute<Grave, String> sex;
    public static volatile SingularAttribute<Grave, String> vitaPath;
    public static volatile SingularAttribute<Grave, String> graveLoc;
    public static volatile SingularAttribute<Grave, Cemetery> cemetery;
    public static volatile SingularAttribute<Grave, String> lastname;
    public static volatile SingularAttribute<Grave, Double> longitude;
    public static volatile SingularAttribute<Grave, Double> latitude;
    public static volatile SingularAttribute<Grave, String> tombstonePath;
    public static volatile SingularAttribute<Grave, String> firstname;
    public static volatile SingularAttribute<Grave, Date> datedeath;
    public static volatile SingularAttribute<Grave, Date> datebirth;

}