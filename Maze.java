
public class Maze {

	/**
	 * This is only an example,
	 * you can change this to test other cases but don't forget to submit the work with this main.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int M = 4;
		int N = 4;
		char[][] maze = {{'1','1','0','1'},{'1','1','0','0'},{'0','1','1','1'},{'0','0','0','1'}};

		if (findPath(maze, 0,0))
			printMaze(maze);
		else
			System.out.println("No solution");
	}

	private static void printMaze(char[][] maze) 
	{
		for (int i = 0; i < maze.length; i++) 
		{
			for (int j = 0; j < maze[0].length; j++) 
			{
				System.out.print(maze[i][j] +" ");
			}
			System.out.println();
		}

	}

	// the function solves a given maze
	private static boolean findPath(char[][] maze, int i, int j) {
		boolean bIsSolved;

		//if out of bounds, wall or been there - can't go through
		if (i < 0 || j < 0 || i > (maze.length-1) || j > (maze[0].length-1) || maze[i][j] == '0' || maze[i][j] == '*')
			bIsSolved = false;
		//if possible to move here, put a *
		else{
			maze[i][j] = '*';
			//if end of maze - solve is true
			if (i == maze.length-1 && j == maze[0].length-1)
				bIsSolved = true;
			//if not end of maze - try all paths from 4 sides, if not possible to go through put '1' back
			else{
				bIsSolved =  findPath(maze, i-1, j) || findPath(maze, i, j-1) || findPath(maze, i, j+1) || findPath(maze, i+1, j);
				if(!bIsSolved)
					maze[i][j] = '1';
			}
		}
		return bIsSolved;
	}
}
