package R;

import J.AbstractC0286q0;
import J.Z0;
import O.n;

/* loaded from: classes.dex */
public final class d extends O.e {

    /* renamed from: n, reason: collision with root package name */
    public e f5375n;

    @Override // O.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0286q0) {
            return super.containsKey((AbstractC0286q0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Z0) {
            return super.containsValue((Z0) obj);
        }
        return false;
    }

    @Override // O.e, M.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final e c() {
        n nVar = this.f5104j;
        e eVar = this.f5375n;
        if (nVar != eVar.f5097h) {
            this.f5103i = new Q.b();
            eVar = new e(this.f5104j, this.f5107m);
        }
        this.f5375n = eVar;
        return eVar;
    }

    @Override // O.e, java.util.AbstractMap, java.util.Map
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

    @Override // O.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0286q0) {
            return (Z0) super.remove((AbstractC0286q0) obj);
        }
        return null;
    }
}
