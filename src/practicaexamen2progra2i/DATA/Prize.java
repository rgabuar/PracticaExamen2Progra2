/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaexamen2progra2i.DATA;

/**
 *
 * @author Administrador
 */
public class Prize {
    
    private int Prize_id;
    private int Prize_amount;
    private String Prize_Name;
    private int Prize_Tickets_Needed;
    private String Description;

    public Prize() {
    }

    public Prize(int Prize_id, int Prize_amount, String Prize_Name, int Prize_Tickets_Needed, String Description) {
        this.Prize_id = Prize_id;
        this.Prize_amount = Prize_amount;
        this.Prize_Name = Prize_Name;
        this.Prize_Tickets_Needed = Prize_Tickets_Needed;
        this.Description = Description;
    }

    public int getPrize_id() {
        return Prize_id;
    }

    public void setPrize_id(int Prize_id) {
        this.Prize_id = Prize_id;
    }

    public int getPrize_amount() {
        return Prize_amount;
    }

    public void setPrize_amount(int Prize_amount) {
        this.Prize_amount = Prize_amount;
    }

    public String getPrize_Name() {
        return Prize_Name;
    }

    public void setPrize_Name(String Prize_Name) {
        this.Prize_Name = Prize_Name;
    }

    public int getPrize_Tickets_Needed() {
        return Prize_Tickets_Needed;
    }

    public void setPrize_Tickets_Needed(int Prize_Tickets_Needed) {
        this.Prize_Tickets_Needed = Prize_Tickets_Needed;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
