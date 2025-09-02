package Angel.app.Interfaces;

public interface EntryManager<T> {
    void AddEntry(T entry);
    void RemoveEntryAt(int index);
}
