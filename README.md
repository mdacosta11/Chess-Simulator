# Chess Simulator

The simulator validates moves for each chess piece (**Pawn**, **Rook**, **Knight**, **Bishop**, **Queen**, **King**) based on chess rules.  
All pieces are created and tested in a command-line interface using user-provided target coordinates.

---

## Object-Oriented Concepts Demonstrated

| Concept | Example |
|----------|----------|
| **Interface Implementation** | `IntFigure`, `IntBishop`, `IntChessBoard` |
| **Abstract Class** | `Figure` partially implements `IntFigure` |
| **Inheritance** | `Pawn`, `Rook`, `Knight`, `Queen`, `King` extend `Figure` |
| **Multiple Inheritance** | `Queen` extends `Rook` *and* implements `IntBishop` |
| **Encapsulation** | Private/protected fields with getters/setters |
| **Polymorphism** | Overridden `moveTo()` and `toString()` |
| **Error Handling** | Custom exceptions: `InvalidMoveException`, `InvalidCoordinateException`, `InvalidPieceException` |
| **Packages** | All classes are under `chess_simulator` |

---

## How It Works

- The **Main** class handles user input and runs the simulation.
- **ChessBoard** verifies valid coordinates within the range (1–8).
- Each subclass of `Figure` defines valid move logic:
  - **Pawn** – forward one square  
  - **Rook** – horizontal/vertical  
  - **Knight** – L-shaped jumps  
  - **Queen** – Rook + Bishop combination  
  - **King** – one square in any direction  
  - **Bishop** – diagonal  

---

## Exception Handling
Each invalid move or coordinate triggers a custom exception:
- `InvalidMoveException` – piece moved illegally  
- `InvalidCoordinateException` – coordinates outside 1–8 range  
- `InvalidPieceException` – invalid or unknown piece type  

---

## Future Improvements
- Add graphical UI for board representation  
- Enable piece interaction (capture/blocking)  
- Save/load board states  
- Extend for multiplayer or AI mode  

---

 ## ▶️ Run Locally
```bash
javac chess_simulator/*.java
java chess_simulator.Main
```

---

## Author
**Michael Acosta**  
University of Texas at El Paso