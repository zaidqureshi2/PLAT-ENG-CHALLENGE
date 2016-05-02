
public class ImmutableQueue<T> implements Queue<T>
{

    T[] queue;

    public ImmutableQueue()
    {
        queue = (T[]) new Object[0];
    }
    private ImmutableQueue( T[] queue, T newItem )
    {
        if ( queue != null ) {
            this.queue = (T[]) new Object[queue.length + 1];
            System.arraycopy( queue, 0, this.queue, 1, queue.length );
            this.queue[0] = newItem;
        }
        else {
            this.queue = (T[]) new Object[1];
            this.queue[0] = newItem;
        }
    }

    private ImmutableQueue( T[] queue )
    {
        this.queue = queue;
    }
    @Override
    public ImmutableQueue<T> enQueue( T newItem )
    {
        if ( newItem == null ) {
            throw new IllegalArgumentException( "Parameter Cannot be empty" );
        }
        return new ImmutableQueue<T>( this.queue, newItem );
    }

    @Override
    public ImmutableQueue<T> deQueue()
    {
        if ( this.isEmpty() ) {
            throw new IllegalStateException( "Queue is Empty" );
        }
        else {
            T[] temp = (T[]) new Object[this.queue.length - 1];
            System.arraycopy( queue, 0, temp, 0, temp.length );

            return new ImmutableQueue<T>( temp );
        }

    }

    @Override
    public T head()
    {
        return this.queue[this.queue.length - 1];
    }

    @Override
    public boolean isEmpty()
    {
        return this.queue.length == 0;
    }

}
