package theMuseumTourOrganizer;

import java.util.Arrays;

class MuseumTourMain{
    public static void main(String[] args) {
        // Example: Create a museum layout
        MuseumTour museum = new MuseumTour(5);

        museum.addExhibit("Monet's Water Lilies", 0);
        museum.addExhibit("Michelangelo's Pieta", 1);
        museum.addExhibit("Egyptian Sarcophagi", 2);
        museum.addExhibit("Picasso's Guernica", 3);
        museum.addExhibit("Van Gogh's Sunflowers", 4);

        museum.setDistance(0, 1, 5);
        museum.setDistance(0, 2, 10);
        museum.setDistance(1, 3, 15);
        museum.setDistance(2, 4, 20);
        museum.setDistance(3, 4, 25);

        museum.displayExhibits();
        museum.displayAdjacencyMatrix();

        // Find shortest path for a tour starting at exhibit 0 and visiting exhibits 1, 3, and 4
        museum.findShortestPath(1, Arrays.asList( 2,4));
    }
}