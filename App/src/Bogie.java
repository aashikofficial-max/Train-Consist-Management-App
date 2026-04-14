class GoodsBogie {
    private String type;   // "Cylindrical", "Open", "Box"
    private String cargo;  // "Petroleum", "Coal", etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}