package A0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m2.InterfaceC0861c;
import u0.N;

/* loaded from: classes.dex */
public final class k implements Iterable, A2.a {

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f60h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f61i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f62j;

    public final boolean a(x xVar) {
        return this.f60h.containsKey(xVar);
    }

    public final Object b(x xVar) {
        Object obj = this.f60h.get(xVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + xVar + " - consider getOrElse or getOrNull");
    }

    public final void e(x xVar, Object obj) {
        boolean z3 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f60h;
        if (!z3 || !linkedHashMap.containsKey(xVar)) {
            linkedHashMap.put(xVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(xVar);
        z2.h.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f16a;
        if (str == null) {
            str = aVar.f16a;
        }
        InterfaceC0861c interfaceC0861c = aVar2.f17b;
        if (interfaceC0861c == null) {
            interfaceC0861c = aVar.f17b;
        }
        linkedHashMap.put(xVar, new a(str, interfaceC0861c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return z2.h.a(this.f60h, kVar.f60h) && this.f61i == kVar.f61i && this.f62j == kVar.f62j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62j) + B1.t.f(this.f60h.hashCode() * 31, 31, this.f61i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f60h.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f61i) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f62j) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f60h.entrySet()) {
            x xVar = (x) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(xVar.f124a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return N.B(this) + "{ " + ((Object) sb) + " }";
    }
}
