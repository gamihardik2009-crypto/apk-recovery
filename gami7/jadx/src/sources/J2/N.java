package J2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class N implements Runnable, Comparable, J {
    private volatile Object _heap;

    /* renamed from: h, reason: collision with root package name */
    public long f4363h;

    /* renamed from: i, reason: collision with root package name */
    public int f4364i = -1;

    public N(long j3) {
        this.f4363h = j3;
    }

    @Override // J2.J
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                O2.v vVar = B.f4343b;
                if (obj == vVar) {
                    return;
                }
                O o3 = obj instanceof O ? (O) obj : null;
                if (o3 != null) {
                    synchronized (o3) {
                        if (b() != null) {
                            o3.b(this.f4364i);
                        }
                    }
                }
                this._heap = vVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final O2.A b() {
        Object obj = this._heap;
        if (obj instanceof O2.A) {
            return (O2.A) obj;
        }
        return null;
    }

    public final int c(long j3, O o3, P p3) {
        synchronized (this) {
            if (this._heap == B.f4343b) {
                return 2;
            }
            synchronized (o3) {
                try {
                    N[] nArr = o3.f5160a;
                    N n3 = nArr != null ? nArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P.f4366n;
                    p3.getClass();
                    if (P.f4368p.get(p3) != 0) {
                        return 1;
                    }
                    if (n3 == null) {
                        o3.f4365c = j3;
                    } else {
                        long j4 = n3.f4363h;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - o3.f4365c > 0) {
                            o3.f4365c = j3;
                        }
                    }
                    long j5 = this.f4363h;
                    long j6 = o3.f4365c;
                    if (j5 - j6 < 0) {
                        this.f4363h = j6;
                    }
                    o3.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f4363h - ((N) obj).f4363h;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    public final void e(O o3) {
        if (this._heap == B.f4343b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = o3;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4363h + ']';
    }
}
