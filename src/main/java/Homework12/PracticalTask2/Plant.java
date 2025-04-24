package Homework12.PracticalTask2;

import Homework12.PracticalTask2.Exceptions.ColorException;
import Homework12.PracticalTask2.Exceptions.SizeException;
import Homework12.PracticalTask2.Exceptions.TypeException;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant() {
    }

    public Plant(int size, String colorStr, String typeStr) throws ColorException, TypeException, SizeException {
        verifySize(size);
        verifyColorAndType(colorStr, typeStr);

        this.size = size;
        this.color = Color.valueOf(colorStr.toUpperCase());
        this.type = Type.valueOf(typeStr.toUpperCase());
    }

    public void verifySize(int size) throws SizeException {
        if (size < 1 || size > 1000) {
            throw new SizeException("Invalid size, size must be in 1-1000 range");
        }
    }

    public void verifyColorAndType(String colorStr, String typeStr) throws ColorException, TypeException {
        try {
            Color.valueOf(colorStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Invalid color " + colorStr);
        }

        try {
            Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Invalid type of plant " + typeStr);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Size - " + size + ", color- " + color + ", type- " + type;
    }
}
