package Horus;

import java.util.List;
import java.util.Optional;

public interface Structure {
	// zwraca dowolny element o podanym kolorze
	Optional findBlockByColor(String color, Wall wall);

	// zwraca wszystkie elementy z danego materiału
	List findBlocksByMaterial(String material, Wall wall);

	//zwraca liczbę wszystkich elementów tworzących strukturę
	int count(Wall wall);
}
