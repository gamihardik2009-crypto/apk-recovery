package B1;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.view.MotionEvent;
import androidx.lifecycle.C0475y;
import androidx.work.Worker;
import i.C0701b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n2.AbstractC0948C;
import n2.AbstractC0949a;
import n2.C0972x;
import o2.C1002h;
import u0.C1314v;
import w1.C1380b;
import w1.C1387i;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f254h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f255i;

    public /* synthetic */ E(int i2, Object obj) {
        this.f254h = i2;
        this.f255i = obj;
    }

    public C1002h a() {
        r1.n nVar = (r1.n) this.f255i;
        C1002h c1002h = new C1002h();
        Cursor m3 = nVar.f9955a.m(new O2.v("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (m3.moveToNext()) {
            try {
                c1002h.add(Integer.valueOf(m3.getInt(0)));
            } finally {
            }
        }
        AbstractC0949a.h(m3, null);
        C1002h f3 = AbstractC0948C.f(c1002h);
        if (!f3.f9355h.isEmpty()) {
            if (((r1.n) this.f255i).f9962h == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C1387i c1387i = ((r1.n) this.f255i).f9962h;
            if (c1387i == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            c1387i.b();
        }
        return f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Set set;
        switch (this.f254h) {
            case 0:
                Worker worker = (Worker) this.f255i;
                try {
                    worker.f6936l.j(worker.f());
                    return;
                } catch (Throwable th) {
                    worker.f6936l.k(th);
                    return;
                }
            case 1:
                synchronized (((C0475y) this.f255i).f6920a) {
                    obj = ((C0475y) this.f255i).f6923d;
                    ((C0475y) this.f255i).f6923d = C0475y.f6919h;
                }
                ((C0475y) this.f255i).a(obj);
                return;
            case 2:
                ReentrantReadWriteLock.ReadLock readLock = ((r1.n) this.f255i).f9955a.f9994i.readLock();
                z2.h.e(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e3) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                            set = C0972x.f9167h;
                        }
                    } catch (IllegalStateException e4) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                        set = C0972x.f9167h;
                    }
                    if (((r1.n) this.f255i).b() && ((r1.n) this.f255i).f9960f.compareAndSet(true, false) && !((r1.n) this.f255i).f9955a.g().q().g()) {
                        C1380b q = ((r1.n) this.f255i).f9955a.g().q();
                        q.b();
                        try {
                            set = a();
                            q.r();
                            if (!set.isEmpty()) {
                                r1.n nVar = (r1.n) this.f255i;
                                synchronized (nVar.f9964j) {
                                    Iterator it = nVar.f9964j.iterator();
                                    while (true) {
                                        C0701b c0701b = (C0701b) it;
                                        if (c0701b.hasNext()) {
                                            ((r1.m) ((Map.Entry) c0701b.next()).getValue()).a(set);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } finally {
                            q.d();
                        }
                    }
                    return;
                } finally {
                    readLock.unlock();
                    ((r1.n) this.f255i).getClass();
                }
            default:
                C1314v c1314v = (C1314v) this.f255i;
                c1314v.removeCallbacks(this);
                MotionEvent motionEvent = c1314v.f11215t0;
                if (motionEvent != null) {
                    boolean z3 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i2 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i2 = 2;
                    }
                    C1314v c1314v2 = (C1314v) this.f255i;
                    c1314v2.H(motionEvent, i2, c1314v2.f11217u0, false);
                    return;
                }
                return;
        }
    }
}
