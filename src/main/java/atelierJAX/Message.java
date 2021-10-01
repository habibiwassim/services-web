package atelierJAX;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder={"to","text","from"}) 
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Message {
	private String from; 
	private String to; 
	private String text; 
	private boolean isNew;
	
	@XmlElement(name="emetteur",required=true) 
	public String getFrom() { 
	return from; 
	} 
	
	public void setFrom(String from) { 
	this.from = from; 
	} 
	
	@XmlElement(name="destinataire") 
	public String getTo() { 
	return to; 
	} 
	
	public void setTo(String to) { 
	this.to = to; 
	} 
	
	@XmlAttribute 
	public String getText() { 
	return text; 
	} 
	
	public void setText(String text) { 
	this.text = text; 
	} 
	
	@XmlTransient 
	public Boolean isNew() { 
	return isNew; 
	} 
	
	public void setNew(Boolean isNew) { 
	this.isNew = isNew; 
	}
}
