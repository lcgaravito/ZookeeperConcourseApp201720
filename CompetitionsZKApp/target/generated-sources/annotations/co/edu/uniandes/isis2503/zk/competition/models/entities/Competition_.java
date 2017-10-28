package co.edu.uniandes.isis2503.zk.competition.models.entities;

import java.util.Calendar;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-28T15:52:16")
@StaticMetamodel(Competition.class)
public class Competition_ { 

    public static volatile SingularAttribute<Competition, Calendar> createdAt;
    public static volatile SingularAttribute<Competition, String> country;
    public static volatile SingularAttribute<Competition, List> competitors;
    public static volatile SingularAttribute<Competition, String> city;
    public static volatile SingularAttribute<Competition, String> year;
    public static volatile SingularAttribute<Competition, Long> winnerId;
    public static volatile SingularAttribute<Competition, String> name;
    public static volatile SingularAttribute<Competition, String> id;
    public static volatile SingularAttribute<Competition, Double> prize;
    public static volatile SingularAttribute<Competition, Calendar> updatedAt;

}