package Modelo;

/**
 *
 * @author Hitler
 * @param <T>
 */
public abstract class CRUD<T> {

    public abstract int Create();

    public abstract <P> Iterable<T> Read();

    public abstract T ReadOne(int folio);

    public abstract boolean Update();

    public abstract boolean Delete(int folio);

}
