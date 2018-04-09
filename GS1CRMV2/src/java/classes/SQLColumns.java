/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author edgargangwareiv
 */
public class SQLColumns {
    
    private String pd;
    private String in;
    private String csr;
    private String cn; //Company name
    private String ec;
    private String ea;
    private String un; //all variables below will not be present when Customer is added
    private String p;
    private String cp;
    private String as;
    private String dbs;
    private String dop;
    private String wrd;
    private String ap;
    private String or;
    private String phase;
    private String array[];

    /**
     * @return the pd
     */
    public String getPd() {
        this.setPd();
        return pd;
    }

    /**
     *
     */
    public void setPd() {
        this.pd = "PurchaseDate";
    }

    /**
     * @return the in
     */
    public String getIn() {
        this.setIn();
        return in;
    }

    /**
     * 
     */
    public void setIn() {
        this.in = "InvoiceNumber";
    }

    /**
     * @return the csr
     */
    public String getCsr() {
        this.setCsr();
        return csr;
    }

    /**
     * @param csr the csr to set
     */
    public void setCsr() {
        this.csr = "CustomerServiceRep";
    }

    /**
     * @return the cn
     */
    public String getCn() {
        this.setCn();
        return cn;
    }

    /**
     * 
     */
    public void setCn() {
        this.cn = "CompanyName";
    }

    /**
     * @return the ec
     */
    public String getEc() {
        this.setEc();
        return ec;
    }

    /**
     * @param ec the ec to set
     */
    public void setEc() {
        this.ec = "ExecutiveContact";
    }

    /**
     * @return the ea
     */
    public String getEa() {
        this.setEa();
        return ea;
    }

    /**
     * @param ea the ea to set
     */
    public void setEa() {
        this.ea = "EmailAddress";
    }

    /**
     * @return the un
     */
    public String getUn() {
        this.setUn();
        return un;
    }

    /**
     * @param un the un to set
     */
    public void setUn() {
        this.un = "GS1UserName";
    }

    /**
     * @return the p
     */
    public String getP() {
        this.setP();
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP() {
        this.p = "GS1Password";
    }

    /**
     * @return the cp
     */
    public String getCp() {
        this.setCp();
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp() {
        this.cp = "UPCCodesPurchased";
    }

    /**
     * @return the as
     */
    public String getAs() {
        this.setAs();
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs() {
        this.as = "GS1ApplicationSubmissionDate";
    }

    /**
     * @return the dbs
     */
    public String getDbs() {
        this.setDbs();
        return dbs;
    }

    /**
     * @param dbs the dbs to set
     */
    public void setDbs() {
        this.dbs = "DateBarcodesSentToCustomer";
    }

    /**
     * @return the dop
     */
    public String getDop() {
        this.setDop();
        return dop;
    }

    /**
     * @param dop the dop to set
     */
    public void setDop() {
        this.dop = "DigitalorPrinted";
    }

    /**
     * @return the wrd
     */
    public String getWrd() {
        this.setWrd();
        return wrd;
    }

    /**
     * @param wrd the wrd to set
     */
    public void setWrd() {
        this.wrd = "GS1WorksheetReturnDate";
    }

    /**
     * @return the ap
     */
    public String getAp() {
        this.setAp();
        return ap;
    }

    /**
     * @param ap the ap to set
     */
    public void setAp() {
        this.ap = "AssignedPrefix";
    }

    /**
     * @return the or
     */
    public String getOr() {
        this.setOr();
        return or;
    }

    /**
     * @param or the or to set
     */
    public void setOr() {
        this.or = "UPCsOfficiallyRegistered";
    }

    /**
     * @return the phase
     */
    public String getPhase() {
        this.setPhase();
        return phase;
    }

    /**
     * @param phase the phase to set
     */
    public void setPhase() {
        this.phase = "CustomerPhase";
    }
    
    public void setAllAttributes() {
        this.array = new String[]{this.getPhase(), this.getOr(), this.getAp(), this.getWrd(),
        this.getDop(), this.getDbs(), this.getAs(), this.getCp(), this.getP(), 
        this.getUn(),this.getEa(), this.getEc(), this.getCn(), this.getCsr(),
        this.getIn(), this.getPd()};
        
        
        
    }
    
}
