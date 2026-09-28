package G2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f1247a;

    public a(g gVar) {
        this.f1247a = new AtomicReference(gVar);
    }

    @Override // G2.g
    public final Iterator iterator() {
        g gVar = (g) this.f1247a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
