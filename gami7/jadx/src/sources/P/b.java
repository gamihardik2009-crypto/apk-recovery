package P;

import G2.e;
import M.f;
import O.c;
import java.util.Iterator;
import n2.AbstractC0956h;

/* loaded from: classes.dex */
public final class b extends AbstractC0956h implements f {

    /* renamed from: l, reason: collision with root package name */
    public static final b f5221l;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5222i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5223j;

    /* renamed from: k, reason: collision with root package name */
    public final c f5224k;

    static {
        Q.b bVar = Q.b.f5264a;
        f5221l = new b(bVar, bVar, c.f5096j);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f5222i = obj;
        this.f5223j = obj2;
        this.f5224k = cVar;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        c cVar = this.f5224k;
        cVar.getClass();
        return cVar.f5098i;
    }

    @Override // m2.AbstractC0872n, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5224k.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new e(this.f5222i, this.f5224k);
    }
}
