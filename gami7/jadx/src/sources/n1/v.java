package n1;

import j.C0742H;
import j.C0744J;
import java.util.ArrayList;
import java.util.Iterator;
import n2.AbstractC0961m;

/* loaded from: classes.dex */
public class v extends s implements Iterable, A2.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f9104u = 0;
    public final C0742H q;

    /* renamed from: r, reason: collision with root package name */
    public int f9105r;

    /* renamed from: s, reason: collision with root package name */
    public String f9106s;

    /* renamed from: t, reason: collision with root package name */
    public String f9107t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(D d3) {
        super(d3);
        z2.h.f(d3, "navGraphNavigator");
        this.q = new C0742H();
    }

    @Override // n1.s
    public final r e(Q1.r rVar) {
        return i(rVar, true, false, this);
    }

    @Override // n1.s
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        if (super.equals(obj)) {
            C0742H c0742h = this.q;
            int f3 = c0742h.f();
            v vVar = (v) obj;
            C0742H c0742h2 = vVar.q;
            if (f3 == c0742h2.f() && this.f9105r == vVar.f9105r) {
                Iterator it = ((G2.a) G2.i.g0(new C0744J(0, c0742h))).iterator();
                while (it.hasNext()) {
                    s sVar = (s) it.next();
                    if (!z2.h.a(sVar, c0742h2.c(sVar.f9093n))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final s g(String str, boolean z3) {
        Object obj;
        v vVar;
        z2.h.f(str, "route");
        C0742H c0742h = this.q;
        z2.h.f(c0742h, "<this>");
        Iterator it = ((G2.a) G2.i.g0(new C0744J(0, c0742h))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s sVar = (s) obj;
            if (H2.l.P(sVar.f9094o, str, false) || sVar.f(str) != null) {
                break;
            }
        }
        s sVar2 = (s) obj;
        if (sVar2 != null) {
            return sVar2;
        }
        if (!z3 || (vVar = this.f9088i) == null || H2.l.V(str)) {
            return null;
        }
        return vVar.g(str, true);
    }

    public final s h(int i2, s sVar, boolean z3) {
        C0742H c0742h = this.q;
        s sVar2 = (s) c0742h.c(i2);
        if (sVar2 != null) {
            return sVar2;
        }
        if (z3) {
            Iterator it = ((G2.a) G2.i.g0(new C0744J(0, c0742h))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    sVar2 = null;
                    break;
                }
                s sVar3 = (s) it.next();
                sVar2 = (!(sVar3 instanceof v) || z2.h.a(sVar3, sVar)) ? null : ((v) sVar3).h(i2, this, true);
                if (sVar2 != null) {
                    break;
                }
            }
        }
        if (sVar2 != null) {
            return sVar2;
        }
        v vVar = this.f9088i;
        if (vVar == null || z2.h.a(vVar, sVar)) {
            return null;
        }
        v vVar2 = this.f9088i;
        z2.h.c(vVar2);
        return vVar2.h(i2, this, z3);
    }

    @Override // n1.s
    public final int hashCode() {
        int i2 = this.f9105r;
        C0742H c0742h = this.q;
        int f3 = c0742h.f();
        for (int i3 = 0; i3 < f3; i3++) {
            i2 = (((i2 * 31) + c0742h.d(i3)) * 31) + ((s) c0742h.g(i3)).hashCode();
        }
        return i2;
    }

    public final r i(Q1.r rVar, boolean z3, boolean z4, s sVar) {
        r rVar2;
        z2.h.f(sVar, "lastVisited");
        r e3 = super.e(rVar);
        r rVar3 = null;
        if (z3) {
            ArrayList arrayList = new ArrayList();
            u uVar = new u(this);
            while (uVar.hasNext()) {
                s sVar2 = (s) uVar.next();
                r e4 = !z2.h.a(sVar2, sVar) ? sVar2.e(rVar) : null;
                if (e4 != null) {
                    arrayList.add(e4);
                }
            }
            rVar2 = (r) AbstractC0961m.O(arrayList);
        } else {
            rVar2 = null;
        }
        v vVar = this.f9088i;
        if (vVar != null && z4 && !z2.h.a(vVar, sVar)) {
            rVar3 = vVar.i(rVar, z3, true, this);
        }
        r[] rVarArr = {e3, rVar2, rVar3};
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            r rVar4 = rVarArr[i2];
            if (rVar4 != null) {
                arrayList2.add(rVar4);
            }
        }
        return (r) AbstractC0961m.O(arrayList2);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    public final void j(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (!(!z2.h.a(str, this.f9094o))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!H2.l.V(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f9105r = hashCode;
        this.f9107t = str;
    }

    @Override // n1.s
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f9107t;
        s g3 = (str == null || H2.l.V(str)) ? null : g(str, true);
        if (g3 == null) {
            g3 = h(this.f9105r, this, false);
        }
        sb.append(" startDestination=");
        if (g3 == null) {
            String str2 = this.f9107t;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f9106s;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f9105r));
                }
            }
        } else {
            sb.append("{");
            sb.append(g3.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "sb.toString()");
        return sb2;
    }
}
