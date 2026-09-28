package O;

import java.util.Iterator;
import java.util.Map;
import n2.AbstractC0956h;

/* loaded from: classes.dex */
public final class k extends AbstractC0956h implements M.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5118i;

    /* renamed from: j, reason: collision with root package name */
    public final c f5119j;

    public /* synthetic */ k(c cVar, int i2) {
        this.f5118i = i2;
        this.f5119j = cVar;
    }

    @Override // m2.AbstractC0872n
    public final int a() {
        switch (this.f5118i) {
            case 0:
                c cVar = this.f5119j;
                cVar.getClass();
                return cVar.f5098i;
            default:
                c cVar2 = this.f5119j;
                cVar2.getClass();
                return cVar2.f5098i;
        }
    }

    @Override // m2.AbstractC0872n, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5118i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f5119j;
                Object obj2 = cVar.get(key);
                return obj2 != null ? z2.h.a(obj2, entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f5119j.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5118i) {
            case 0:
                n nVar = this.f5119j.f5097h;
                o[] oVarArr = new o[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    oVarArr[i2] = new p(0);
                }
                return new l(nVar, oVarArr);
            default:
                n nVar2 = this.f5119j.f5097h;
                o[] oVarArr2 = new o[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    oVarArr2[i3] = new p(1);
                }
                return new l(nVar2, oVarArr2);
        }
    }
}
