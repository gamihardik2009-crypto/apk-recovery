package R;

import J.AbstractC0286q0;
import J.InterfaceC0282o0;
import J.Z0;
import O.n;

/* loaded from: classes.dex */
public final class e extends O.c implements InterfaceC0282o0 {

    /* renamed from: k, reason: collision with root package name */
    public static final e f5376k = new e(n.f5122e, 0);

    @Override // O.c
    /* renamed from: a */
    public final O.e d() {
        d dVar = new d(this);
        dVar.f5375n = this;
        return dVar;
    }

    @Override // O.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0286q0) {
            return super.containsKey((AbstractC0286q0) obj);
        }
        return false;
    }

    @Override // n2.AbstractC0953e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Z0) {
            return super.containsValue((Z0) obj);
        }
        return false;
    }

    @Override // O.c, M.e
    public final M.d d() {
        d dVar = new d(this);
        dVar.f5375n = this;
        return dVar;
    }

    @Override // O.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0286q0) {
            return (Z0) super.get((AbstractC0286q0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0286q0) ? obj2 : (Z0) super.getOrDefault((AbstractC0286q0) obj, (Z0) obj2);
    }
}
