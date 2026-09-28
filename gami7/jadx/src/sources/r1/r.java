package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n2.C0970v;
import n2.C0971w;
import n2.C0972x;
import w1.C1380b;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public volatile C1380b f9986a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f9987b;

    /* renamed from: c, reason: collision with root package name */
    public L1.o f9988c;

    /* renamed from: d, reason: collision with root package name */
    public v1.c f9989d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9991f;

    /* renamed from: g, reason: collision with root package name */
    public List f9992g;

    /* renamed from: k, reason: collision with root package name */
    public final Map f9996k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f9997l;

    /* renamed from: e, reason: collision with root package name */
    public final n f9990e = d();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f9993h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f9994i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    public final ThreadLocal f9995j = new ThreadLocal();

    public r() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        z2.h.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f9996k = synchronizedMap;
        this.f9997l = new LinkedHashMap();
    }

    public static Object p(Class cls, v1.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof h) {
            return p(cls, ((h) cVar).a());
        }
        return null;
    }

    public final void a() {
        if (this.f9991f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!g().q().g() && this.f9995j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        C1380b q = g().q();
        this.f9990e.e(q);
        if (q.i()) {
            q.b();
        } else {
            q.a();
        }
    }

    public abstract n d();

    public abstract v1.c e(C1144g c1144g);

    public List f(LinkedHashMap linkedHashMap) {
        z2.h.f(linkedHashMap, "autoMigrationSpecs");
        return C0970v.f9165h;
    }

    public final v1.c g() {
        v1.c cVar = this.f9989d;
        if (cVar != null) {
            return cVar;
        }
        z2.h.j("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return C0972x.f9167h;
    }

    public Map i() {
        return C0971w.f9166h;
    }

    public final void j() {
        g().q().d();
        if (g().q().g()) {
            return;
        }
        n nVar = this.f9990e;
        if (nVar.f9960f.compareAndSet(false, true)) {
            Executor executor = nVar.f9955a.f9987b;
            if (executor != null) {
                executor.execute(nVar.f9967m);
            } else {
                z2.h.j("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(C1380b c1380b) {
        n nVar = this.f9990e;
        nVar.getClass();
        synchronized (nVar.f9966l) {
            if (nVar.f9961g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            c1380b.e("PRAGMA temp_store = MEMORY;");
            c1380b.e("PRAGMA recursive_triggers='ON';");
            c1380b.e("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            nVar.e(c1380b);
            nVar.f9962h = c1380b.c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            nVar.f9961g = true;
        }
    }

    public final boolean l() {
        C1380b c1380b = this.f9986a;
        return c1380b != null && c1380b.h();
    }

    public final Cursor m(v1.e eVar, CancellationSignal cancellationSignal) {
        z2.h.f(eVar, "query");
        a();
        b();
        return cancellationSignal != null ? g().q().o(eVar, cancellationSignal) : g().q().l(eVar);
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object call = callable.call();
            o();
            return call;
        } finally {
            j();
        }
    }

    public final void o() {
        g().q().r();
    }
}
