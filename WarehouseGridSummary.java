class WarehouseGridSummary{
    int total_items=0;
    int max_coordinates=0;
    public void warehouseSummary(String[][] grid){
        for (String[] grid1 : grid) {
            for (String grid11 : grid1) {
                total_items += grid11.length();
            }
        }
        for (String[] grid1 : grid) {
            for (String grid11 : grid1) {
                if (grid11.length() > max_coordinates) {
                    max_coordinates = grid11.length();
                }
            }
        }
    }
    public int getTotalItems(){
        return total_items;
    }
    public int getMaxCoordinates(){
        return max_coordinates;
    }
    public static void main(String[] args){
        String[][] grid = {{"4", "9", "2"}, {"7", "1", "6"}, {"3", "12", "5"}};
        WarehouseGridSummary summary = new WarehouseGridSummary();
        summary.warehouseSummary(grid);
        System.out.println("(" + summary.getTotalItems() + ", " + summary.getMaxCoordinates() + ")");
    }
}