public  class user extends onlineshopping{

    @Override
    public void browseProduct() {
        System.out.println("Please search your product");
    }
    @Override
    public void addToCart() {
        System.out.println("Your item added to cart");
    }

    @Override
    public void checkOut() {
        System.out.println("your product is on your way");
    }
}
