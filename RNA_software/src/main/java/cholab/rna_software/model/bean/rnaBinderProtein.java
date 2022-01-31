/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cholab.rna_software.model.bean;

/**
 *
 * @author Guilherme Bertola
 */
public class rnaBinderProtein {

    // atributes
    // unique id for primary key
    private Integer id;
    // common name for the protein
    private String name;
    // Amino acids sequence
    private String sequence;

    // constructor class
    public rnaBinderProtein(Integer id, String name, String sequence) {
        this.id = id;
        this.name = name;
        this.sequence = sequence;
    }

    // getters and setters for the attributes
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    //methods
}
