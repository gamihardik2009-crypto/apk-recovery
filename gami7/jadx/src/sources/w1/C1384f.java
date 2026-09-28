package w1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m.AbstractC0837j;
import n1.E;
import p1.C1058a;
import x1.C1392a;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384f extends SQLiteOpenHelper {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11449o = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Context f11450h;

    /* renamed from: i, reason: collision with root package name */
    public final C1381c f11451i;

    /* renamed from: j, reason: collision with root package name */
    public final C1058a f11452j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11453k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11454l;

    /* renamed from: m, reason: collision with root package name */
    public final C1392a f11455m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11456n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384f(Context context, String str, final C1381c c1381c, final C1058a c1058a, boolean z3) {
        super(context, str, null, c1058a.f9731a, new DatabaseErrorHandler() { // from class: w1.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                z2.h.f(C1058a.this, "$callback");
                C1381c c1381c2 = c1381c;
                z2.h.f(c1381c2, "$dbRef");
                int i2 = C1384f.f11449o;
                z2.h.e(sQLiteDatabase, "dbObj");
                C1380b l3 = E.l(c1381c2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + l3 + ".path");
                SQLiteDatabase sQLiteDatabase2 = l3.f11443h;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C1058a.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        l3.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            z2.h.e(obj, "p.second");
                            C1058a.a((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C1058a.a(path2);
                        }
                    }
                }
            }
        });
        z2.h.f(context, "context");
        z2.h.f(c1058a, "callback");
        this.f11450h = context;
        this.f11451i = c1381c;
        this.f11452j = c1058a;
        this.f11453k = z3;
        if (str == null) {
            str = UUID.randomUUID().toString();
            z2.h.e(str, "randomUUID().toString()");
        }
        this.f11455m = new C1392a(str, context.getCacheDir(), false);
    }

    public final C1380b a(boolean z3) {
        C1392a c1392a = this.f11455m;
        try {
            c1392a.a((this.f11456n || getDatabaseName() == null) ? false : true);
            this.f11454l = false;
            SQLiteDatabase d3 = d(z3);
            if (!this.f11454l) {
                C1380b b3 = b(d3);
                c1392a.b();
                return b3;
            }
            close();
            C1380b a3 = a(z3);
            c1392a.b();
            return a3;
        } catch (Throwable th) {
            c1392a.b();
            throw th;
        }
    }

    public final C1380b b(SQLiteDatabase sQLiteDatabase) {
        z2.h.f(sQLiteDatabase, "sqLiteDatabase");
        return E.l(this.f11451i, sQLiteDatabase);
    }

    public final SQLiteDatabase c(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            z2.h.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        z2.h.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C1392a c1392a = this.f11455m;
        try {
            c1392a.a(c1392a.f11476a);
            super.close();
            this.f11451i.f11444a = null;
            this.f11456n = false;
        } finally {
            c1392a.b();
        }
    }

    public final SQLiteDatabase d(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z4 = this.f11456n;
        Context context = this.f11450h;
        if (databaseName != null && !z4 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return c(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return c(z3);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C1383e) {
                    C1383e c1383e = th;
                    int d3 = AbstractC0837j.d(c1383e.f11447h);
                    Throwable th2 = c1383e.f11448i;
                    if (d3 == 0 || d3 == 1 || d3 == 2 || d3 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f11453k) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return c(z3);
                } catch (C1383e e3) {
                    throw e3.f11448i;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        z2.h.f(sQLiteDatabase, "db");
        boolean z3 = this.f11454l;
        C1058a c1058a = this.f11452j;
        if (!z3 && c1058a.f9731a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            c1058a.v(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1383e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        z2.h.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f11452j.w(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C1383e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        z2.h.f(sQLiteDatabase, "db");
        this.f11454l = true;
        try {
            this.f11452j.x(b(sQLiteDatabase), i2, i3);
        } catch (Throwable th) {
            throw new C1383e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        z2.h.f(sQLiteDatabase, "db");
        if (!this.f11454l) {
            try {
                this.f11452j.y(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C1383e(5, th);
            }
        }
        this.f11456n = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        z2.h.f(sQLiteDatabase, "sqLiteDatabase");
        this.f11454l = true;
        try {
            this.f11452j.z(b(sQLiteDatabase), i2, i3);
        } catch (Throwable th) {
            throw new C1383e(3, th);
        }
    }
}
