package O;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements A2.d {

    /* renamed from: j, reason: collision with root package name */
    public final h f5094j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5095k;

    public b(h hVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f5094j = hVar;
        this.f5095k = obj2;
    }

    @Override // O.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f5095k;
    }

    @Override // O.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f5095k;
        this.f5095k = obj;
        f fVar = (f) this.f5094j.f5115i;
        e eVar = fVar.f5108k;
        Object obj3 = this.f5092h;
        if (eVar.containsKey(obj3)) {
            boolean z3 = fVar.f5101j;
            if (!z3) {
                eVar.put(obj3, obj);
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                o oVar = fVar.f5099h[fVar.f5100i];
                Object obj4 = oVar.f5127h[oVar.f5129j];
                eVar.put(obj3, obj);
                fVar.e(obj4 != null ? obj4.hashCode() : 0, eVar.f5104j, obj4, 0);
            }
            fVar.f5111n = eVar.f5106l;
        }
        return obj2;
    }
}
