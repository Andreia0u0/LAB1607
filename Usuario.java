import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "usuario")
public class Usuario
{  
    @DatabaseField
    private String nome;
   
    @DatabaseField
    private String email;
   
    @DatabaseField
    public String senha;
   
//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public String getNome(){
        return this.nome;
    }

    /**SET Method Propertie id*/
    public void setnome(String nome){
        this.nome = nome;
    }

    /**GET Method Propertie fullName*/
    public String getEmail(){
        return this.email;
    }

    /**SET Method Propertie fullName*/
    public void setEmail(String email){
        this.email = email;
    }

    /**GET Method Propertie registration*/
    public String getSenha(){
        return this.senha;
    }

    /**SET Method Propertie registration*/
    public void setSenha (String senha){
        this.senha = senha;
    }
}//End classimport java.sql.*;