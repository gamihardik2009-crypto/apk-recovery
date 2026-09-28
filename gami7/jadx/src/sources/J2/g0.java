package J2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class g0 implements V {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4395i = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_isCompleting");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4396j = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_rootCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4397k = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: h, reason: collision with root package name */
    public final k0 f4398h;

    public g0(k0 k0Var, Throwable th) {
        this.f4398h = k0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f4396j.set(this, th);
            return;
        }
        if (th == c3) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4397k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // J2.V
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f4396j.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return f4395i.get(this) != 0;
    }

    @Override // J2.V
    public final k0 f() {
        return this.f4398h;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4397k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !z2.h.a(th, c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, B.f4349h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f4397k.get(this) + ", list=" + this.f4398h + ']';
    }
}
