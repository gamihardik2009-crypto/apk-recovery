package T;

import C0.C0018a;
import J.C0257c;
import j.C0769y;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n2.AbstractC0961m;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f5746a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5748c;

    /* renamed from: g, reason: collision with root package name */
    public C1.q f5752g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5753h;

    /* renamed from: i, reason: collision with root package name */
    public v f5754i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5747b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0018a f5749d = new C0018a(8, this);

    /* renamed from: e, reason: collision with root package name */
    public final A0.n f5750e = new A0.n(16, this);

    /* renamed from: f, reason: collision with root package name */
    public final L.d f5751f = new L.d(new v[16]);

    /* renamed from: j, reason: collision with root package name */
    public long f5755j = -1;

    public w(y2.c cVar) {
        this.f5746a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(w wVar) {
        boolean z3;
        Set set;
        synchronized (wVar.f5751f) {
            z3 = wVar.f5748c;
        }
        if (z3) {
            return false;
        }
        boolean z4 = false;
        while (true) {
            AtomicReference atomicReference = wVar.f5747b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0257c.z("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z4;
            }
            synchronized (wVar.f5751f) {
                L.d dVar = wVar.f5751f;
                int i2 = dVar.f4620j;
                if (i2 > 0) {
                    Object[] objArr = dVar.f4618h;
                    int i3 = 0;
                    do {
                        z4 = ((v) objArr[i3]).b(set2) || z4;
                        i3++;
                    } while (i3 < i2);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f5751f) {
            L.d dVar = this.f5751f;
            int i2 = dVar.f4620j;
            if (i2 > 0) {
                Object[] objArr = dVar.f4618h;
                int i3 = 0;
                do {
                    v vVar = (v) objArr[i3];
                    ((C0769y) vVar.f5738e.f165i).a();
                    vVar.f5739f.a();
                    ((C0769y) vVar.f5744k.f165i).a();
                    vVar.f5745l.clear();
                    i3++;
                } while (i3 < i2);
            }
        }
    }

    public final void c(Object obj, y2.c cVar, y2.a aVar) {
        Object obj2;
        v vVar;
        synchronized (this.f5751f) {
            L.d dVar = this.f5751f;
            int i2 = dVar.f4620j;
            if (i2 > 0) {
                Object[] objArr = dVar.f4618h;
                int i3 = 0;
                do {
                    obj2 = objArr[i3];
                    if (((v) obj2).f5734a == cVar) {
                        break;
                    } else {
                        i3++;
                    }
                } while (i3 < i2);
            }
            obj2 = null;
            vVar = (v) obj2;
            if (vVar == null) {
                z2.h.d(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                z2.v.d(1, cVar);
                vVar = new v(cVar);
                dVar.b(vVar);
            }
        }
        boolean z3 = this.f5753h;
        v vVar2 = this.f5754i;
        long j3 = this.f5755j;
        if (j3 == -1 || j3 == C0257c.C()) {
            try {
                this.f5753h = false;
                this.f5754i = vVar;
                this.f5755j = Thread.currentThread().getId();
                vVar.a(obj, this.f5750e, aVar);
                return;
            } finally {
                this.f5754i = vVar2;
                this.f5753h = z3;
                this.f5755j = j3;
            }
        }
        C0257c.W("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + C0257c.C() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }

    public final void d() {
        C0018a c0018a = this.f5749d;
        K1.m mVar = n.f5709a;
        n.f(m.f5707k);
        synchronized (n.f5710b) {
            n.f5715g = AbstractC0961m.Q(n.f5715g, c0018a);
        }
        this.f5752g = new C1.q(c0018a);
    }
}
