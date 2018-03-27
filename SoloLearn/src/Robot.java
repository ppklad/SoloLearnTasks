public class Robot {
    int x = 0;
    int y = 0;
    Direction dir = Direction.UP;

    Robot(int x, int y, Direction d) {
        this.x = x;
        this.y = y;
        this.dir = d;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (dir) {
            case LEFT:
                dir = Direction.DOWN;
                break;
            case UP:
                dir = Direction.LEFT;
                break;
            case RIGHT:
                dir = Direction.UP;
                break;
            case DOWN:
                dir = Direction.RIGHT;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (dir) {
            case LEFT:
                dir = Direction.UP;
                break;
            case UP:
                dir = Direction.RIGHT;
                break;
            case RIGHT:
                dir = Direction.DOWN;
                break;
            case DOWN:
                dir = Direction.LEFT;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (dir) {
            case LEFT: {
                x--;
            }
            ;
            break;
            case UP: {
                y++;
            }
            ;
            break;
            case RIGHT: {
                x++;
            }
            ;
            break;
            case DOWN: {
                y--;
            }
            ;
        }

    }

    public void tellXY() {
        System.out.println("X:" + x + " Y:" + y + " Direction:" + dir);
    }
}
