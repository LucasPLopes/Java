/*
    Regras para criação de um ManagedBean:
    1. construtor sem argumentos
    2. públicos getters e setters
    *os beans começar letra minúscula
*/
package forms;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author lucas
 */
@ManagedBean
public class Student {
    private String firstName;
    private String secondName;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName.toUpperCase();
    }

    
}
