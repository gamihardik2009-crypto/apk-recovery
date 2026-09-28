package androidx.lifecycle;

import android.os.Looper;
import h.C0694b;
import i.C0700a;
import i.C0702c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import u1.C1325b;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6907a;

    /* renamed from: b, reason: collision with root package name */
    public C0700a f6908b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0466o f6909c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f6910d;

    /* renamed from: e, reason: collision with root package name */
    public int f6911e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6912f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6913g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6914h;

    /* renamed from: i, reason: collision with root package name */
    public final M2.d0 f6915i;

    public C0472v(InterfaceC0470t interfaceC0470t) {
        z2.h.f(interfaceC0470t, "provider");
        new AtomicReference(null);
        this.f6907a = true;
        this.f6908b = new C0700a();
        EnumC0466o enumC0466o = EnumC0466o.f6899i;
        this.f6909c = enumC0466o;
        this.f6914h = new ArrayList();
        this.f6910d = new WeakReference(interfaceC0470t);
        this.f6915i = M2.P.b(enumC0466o);
    }

    public final void a(InterfaceC0469s interfaceC0469s) {
        r c0458g;
        InterfaceC0470t interfaceC0470t;
        ArrayList arrayList = this.f6914h;
        int i2 = 1;
        z2.h.f(interfaceC0469s, "observer");
        c("addObserver");
        EnumC0466o enumC0466o = this.f6909c;
        EnumC0466o enumC0466o2 = EnumC0466o.f6898h;
        if (enumC0466o != enumC0466o2) {
            enumC0466o2 = EnumC0466o.f6899i;
        }
        C0471u c0471u = new C0471u();
        HashMap hashMap = AbstractC0474x.f6917a;
        boolean z3 = interfaceC0469s instanceof r;
        boolean z4 = interfaceC0469s instanceof InterfaceC0456e;
        if (z3 && z4) {
            c0458g = new C0458g((InterfaceC0456e) interfaceC0469s, (r) interfaceC0469s);
        } else if (z4) {
            c0458g = new C0458g((InterfaceC0456e) interfaceC0469s, (r) null);
        } else if (z3) {
            c0458g = (r) interfaceC0469s;
        } else {
            Class<?> cls = interfaceC0469s.getClass();
            if (AbstractC0474x.b(cls) == 2) {
                Object obj = AbstractC0474x.f6918b.get(cls);
                z2.h.c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    AbstractC0474x.a((Constructor) list.get(0), interfaceC0469s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0460i[] interfaceC0460iArr = new InterfaceC0460i[size];
                if (size > 0) {
                    AbstractC0474x.a((Constructor) list.get(0), interfaceC0469s);
                    throw null;
                }
                c0458g = new C1325b(i2, interfaceC0460iArr);
            } else {
                c0458g = new C0458g(interfaceC0469s);
            }
        }
        c0471u.f6906b = c0458g;
        c0471u.f6905a = enumC0466o2;
        if (((C0471u) this.f6908b.c(interfaceC0469s, c0471u)) == null && (interfaceC0470t = (InterfaceC0470t) this.f6910d.get()) != null) {
            boolean z5 = this.f6911e != 0 || this.f6912f;
            EnumC0466o b3 = b(interfaceC0469s);
            this.f6911e++;
            while (c0471u.f6905a.compareTo(b3) < 0 && this.f6908b.f7788l.containsKey(interfaceC0469s)) {
                arrayList.add(c0471u.f6905a);
                C0463l c0463l = EnumC0465n.Companion;
                EnumC0466o enumC0466o3 = c0471u.f6905a;
                c0463l.getClass();
                EnumC0465n b4 = C0463l.b(enumC0466o3);
                if (b4 == null) {
                    throw new IllegalStateException("no event up from " + c0471u.f6905a);
                }
                c0471u.a(interfaceC0470t, b4);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(interfaceC0469s);
            }
            if (!z5) {
                h();
            }
            this.f6911e--;
        }
    }

    public final EnumC0466o b(InterfaceC0469s interfaceC0469s) {
        C0471u c0471u;
        HashMap hashMap = this.f6908b.f7788l;
        C0702c c0702c = hashMap.containsKey(interfaceC0469s) ? ((C0702c) hashMap.get(interfaceC0469s)).f7795k : null;
        EnumC0466o enumC0466o = (c0702c == null || (c0471u = (C0471u) c0702c.f7793i) == null) ? null : c0471u.f6905a;
        ArrayList arrayList = this.f6914h;
        EnumC0466o enumC0466o2 = arrayList.isEmpty() ^ true ? (EnumC0466o) arrayList.get(arrayList.size() - 1) : null;
        EnumC0466o enumC0466o3 = this.f6909c;
        z2.h.f(enumC0466o3, "state1");
        if (enumC0466o == null || enumC0466o.compareTo(enumC0466o3) >= 0) {
            enumC0466o = enumC0466o3;
        }
        return (enumC0466o2 == null || enumC0466o2.compareTo(enumC0466o) >= 0) ? enumC0466o : enumC0466o2;
    }

    public final void c(String str) {
        if (this.f6907a) {
            C0694b.N().f7779f.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(EnumC0465n enumC0465n) {
        z2.h.f(enumC0465n, "event");
        c("handleLifecycleEvent");
        e(enumC0465n.a());
    }

    public final void e(EnumC0466o enumC0466o) {
        EnumC0466o enumC0466o2 = this.f6909c;
        if (enumC0466o2 == enumC0466o) {
            return;
        }
        EnumC0466o enumC0466o3 = EnumC0466o.f6899i;
        EnumC0466o enumC0466o4 = EnumC0466o.f6898h;
        if (enumC0466o2 == enumC0466o3 && enumC0466o == enumC0466o4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0466o + ", but was " + this.f6909c + " in component " + this.f6910d.get()).toString());
        }
        this.f6909c = enumC0466o;
        if (this.f6912f || this.f6911e != 0) {
            this.f6913g = true;
            return;
        }
        this.f6912f = true;
        h();
        this.f6912f = false;
        if (this.f6909c == enumC0466o4) {
            this.f6908b = new C0700a();
        }
    }

    public final void f(InterfaceC0469s interfaceC0469s) {
        z2.h.f(interfaceC0469s, "observer");
        c("removeObserver");
        this.f6908b.b(interfaceC0469s);
    }

    public final void g(EnumC0466o enumC0466o) {
        z2.h.f(enumC0466o, "state");
        c("setCurrentState");
        e(enumC0466o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f6913g = false;
        r7.f6915i.k(r7.f6909c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0472v.h():void");
    }
}
