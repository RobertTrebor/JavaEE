package de.lengsfeld.virtualremembrance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-03T19:19:38")
@StaticMetamodel(Cemetery.class)
public class Cemetery_ { 

    public static volatile SingularAttribute<Cemetery, Long> id;
    public static volatile SingularAttribute<Cemetery, String> name;
    public static volatile SingularAttribute<Cemetery, String> zipcode;
    public static volatile SingularAttribute<Cemetery, String> street;
    public static volatile SingularAttribute<Cemetery, Double> longitude;
    public static volatile SingularAttribute<Cemetery, Double> latitude;
    public static volatile SingularAttribute<Cemetery, String> city;
    public static volatile SingularAttribute<Cemetery, String> country;

}