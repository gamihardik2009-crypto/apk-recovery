package V;

/* loaded from: classes.dex */
public interface m extends o {
    @Override // V.o
    default boolean c(y2.c cVar) {
        return ((Boolean) cVar.l(this)).booleanValue();
    }

    @Override // V.o
    default Object e(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
