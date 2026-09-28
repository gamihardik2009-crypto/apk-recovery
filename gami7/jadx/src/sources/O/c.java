package O;

import n2.AbstractC0953e;

/* loaded from: classes.dex */
public class c extends AbstractC0953e implements M.e {

    /* renamed from: j, reason: collision with root package name */
    public static final c f5096j = new c(n.f5122e, 0);

    /* renamed from: h, reason: collision with root package name */
    public final n f5097h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5098i;

    public c(n nVar, int i2) {
        this.f5097h = nVar;
        this.f5098i = i2;
    }

    @Override // M.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e d() {
        return new e(this);
    }

    public final c b(Object obj, P.a aVar) {
        m u3 = this.f5097h.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u3 == null ? this : new c((n) u3.f5121b, this.f5098i + u3.f5120a);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f5097h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f5097h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
