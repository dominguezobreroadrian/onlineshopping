package tipos;



/**
 * Class Address
 */
public class Address {

	private String calle;
    private String ciudad;
    private String zip;

    public Address() {}

    public Address(String calle, String ciudad, String zip) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.zip = zip;
    }

    public String getcalle() { 
    	return calle; 
    }
    
    public void setcalle(String calle) { 
    	this.calle = calle; 
    }

    public String getciudad() { 
    	return ciudad; 
    }
    
    public void setciudad(String ciudad) { 
    	this.ciudad = ciudad; 
    }

    public String getZip() {
    	return zip; 
    }
    
    public void setZip(String zip) { 
    	this.zip = zip; 
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + " (" + zip + ")";
    }

}
