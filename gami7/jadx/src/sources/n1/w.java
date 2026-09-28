package n1;

import j.C0742H;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w extends t {

    /* renamed from: g, reason: collision with root package name */
    public final F f9108g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9109h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(F f3, String str, String str2) {
        super(f3.b(E.k(x.class)), str2);
        z2.h.f(f3, "provider");
        z2.h.f(str, "startDestination");
        this.f9110i = new ArrayList();
        this.f9108g = f3;
        this.f9109h = str;
    }

    public final v c() {
        v vVar = (v) super.a();
        ArrayList arrayList = this.f9110i;
        z2.h.f(arrayList, "nodes");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar != null) {
                int i2 = sVar.f9093n;
                String str = sVar.f9094o;
                if (i2 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                }
                if (vVar.f9094o != null && !(!z2.h.a(str, r5))) {
                    throw new IllegalArgumentException(("Destination " + sVar + " cannot have the same route as graph " + vVar).toString());
                }
                if (i2 == vVar.f9093n) {
                    throw new IllegalArgumentException(("Destination " + sVar + " cannot have the same id as graph " + vVar).toString());
                }
                C0742H c0742h = vVar.q;
                s sVar2 = (s) c0742h.c(i2);
                if (sVar2 == sVar) {
                    continue;
                } else {
                    if (sVar.f9088i != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    if (sVar2 != null) {
                        sVar2.f9088i = null;
                    }
                    sVar.f9088i = vVar;
                    c0742h.e(sVar.f9093n, sVar);
                }
            }
        }
        String str2 = this.f9109h;
        if (str2 != null) {
            vVar.j(str2);
            return vVar;
        }
        if (this.f9097c != null) {
            throw new IllegalStateException("You must set a start destination route");
        }
        throw new IllegalStateException("You must set a start destination id");
    }
}
