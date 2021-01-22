package model.entities;

public final class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ " + String.format("%.2f", totalPrice() ) );
		sb.append(" (Customs fee: $ " + String.format("%.2f", customsFee) + ")");
		
		return sb.toString();
	}

}
