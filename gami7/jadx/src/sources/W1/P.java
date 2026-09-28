package W1;

import M2.C0357v;
import M2.d0;
import androidx.lifecycle.X;
import java.util.ArrayList;
import java.util.Iterator;
import n2.C0970v;
import n2.C0972x;

/* loaded from: classes.dex */
public final class P extends X {

    /* renamed from: b, reason: collision with root package name */
    public final Q1.p f5959b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f5960c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f5961d;

    /* renamed from: e, reason: collision with root package name */
    public final M2.K f5962e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f5963f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f5964g;

    /* renamed from: h, reason: collision with root package name */
    public final M2.K f5965h;

    /* renamed from: i, reason: collision with root package name */
    public final M2.K f5966i;

    /* renamed from: j, reason: collision with root package name */
    public final M2.K f5967j;

    public P(Q1.p pVar) {
        z2.h.f(pVar, "repository");
        this.f5959b = pVar;
        d0 b3 = M2.P.b("");
        this.f5960c = b3;
        d0 b4 = M2.P.b("");
        this.f5961d = b4;
        this.f5962e = new M2.K(b4);
        C0970v c0970v = C0970v.f9165h;
        d0 b5 = M2.P.b(c0970v);
        this.f5963f = b5;
        d0 b6 = M2.P.b(C0972x.f9167h);
        this.f5964g = b6;
        this.f5965h = new M2.K(b6);
        this.f5966i = M2.P.n(new M2.F(b5, b4, new H(3, null, 0)), androidx.lifecycle.Q.j(this), M2.T.a(5000L, 2), c0970v);
        this.f5967j = M2.P.n(M2.P.o(b3, new C0357v(this, null)), androidx.lifecycle.Q.j(this), M2.T.a(5000L, 2), c0970v);
    }

    public static final ArrayList e(P p3, ArrayList arrayList) {
        p3.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next());
            if (arrayList3.size() == 900) {
                arrayList2.add(arrayList3);
                arrayList3 = new ArrayList();
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }
}
