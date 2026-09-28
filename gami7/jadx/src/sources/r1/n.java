package r1;

import B1.E;
import J.S;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import i.C0702c;
import i.C0705f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n2.AbstractC0946A;
import n2.AbstractC0948C;
import n2.AbstractC0961m;
import n2.AbstractC0962n;
import o2.C1002h;
import w1.C1380b;
import w1.C1387i;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f9954n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final r f9955a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9956b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f9957c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9958d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9959e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9960f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f9961g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C1387i f9962h;

    /* renamed from: i, reason: collision with root package name */
    public final S f9963i;

    /* renamed from: j, reason: collision with root package name */
    public final C0705f f9964j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9965k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9966l;

    /* renamed from: m, reason: collision with root package name */
    public final E f9967m;

    public n(r rVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        z2.h.f(rVar, "database");
        this.f9955a = rVar;
        this.f9956b = hashMap;
        this.f9957c = hashMap2;
        this.f9960f = new AtomicBoolean(false);
        this.f9963i = new S(strArr.length);
        z2.h.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f9964j = new C0705f();
        this.f9965k = new Object();
        this.f9966l = new Object();
        this.f9958d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr[i2];
            Locale locale = Locale.US;
            z2.h.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            z2.h.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f9958d.put(lowerCase, Integer.valueOf(i2));
            String str3 = (String) this.f9956b.get(strArr[i2]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                z2.h.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i2] = lowerCase;
        }
        this.f9959e = strArr2;
        for (Map.Entry entry : this.f9956b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            z2.h.e(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            z2.h.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f9958d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                z2.h.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f9958d;
                linkedHashMap.put(lowerCase3, AbstractC0946A.k(linkedHashMap, lowerCase2));
            }
        }
        this.f9967m = new E(2, this);
    }

    public final void a(K1.e eVar) {
        Object obj;
        m mVar;
        boolean z3;
        z2.h.f(eVar, "observer");
        String[] strArr = (String[]) eVar.f4536a;
        C1002h c1002h = new C1002h();
        for (String str : strArr) {
            Locale locale = Locale.US;
            z2.h.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            z2.h.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map map = this.f9957c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                z2.h.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj2 = map.get(lowerCase2);
                z2.h.c(obj2);
                c1002h.addAll((Collection) obj2);
            } else {
                c1002h.add(str);
            }
        }
        String[] strArr2 = (String[]) AbstractC0948C.f(c1002h).toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            LinkedHashMap linkedHashMap = this.f9958d;
            Locale locale2 = Locale.US;
            z2.h.e(locale2, "US");
            String lowerCase3 = str2.toLowerCase(locale2);
            z2.h.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(num);
        }
        int[] W3 = AbstractC0961m.W(arrayList);
        m mVar2 = new m(eVar, W3, strArr2);
        synchronized (this.f9964j) {
            C0705f c0705f = this.f9964j;
            C0702c a3 = c0705f.a(eVar);
            if (a3 != null) {
                obj = a3.f7793i;
            } else {
                C0702c c0702c = new C0702c(eVar, mVar2);
                c0705f.f7802k++;
                C0702c c0702c2 = c0705f.f7800i;
                if (c0702c2 == null) {
                    c0705f.f7799h = c0702c;
                    c0705f.f7800i = c0702c;
                } else {
                    c0702c2.f7794j = c0702c;
                    c0702c.f7795k = c0702c2;
                    c0705f.f7800i = c0702c;
                }
                obj = null;
            }
            mVar = (m) obj;
        }
        if (mVar == null) {
            S s3 = this.f9963i;
            int[] copyOf = Arrays.copyOf(W3, W3.length);
            s3.getClass();
            z2.h.f(copyOf, "tableIds");
            synchronized (s3) {
                z3 = false;
                for (int i2 : copyOf) {
                    long[] jArr = (long[]) s3.f4082b;
                    long j3 = jArr[i2];
                    jArr[i2] = 1 + j3;
                    if (j3 == 0) {
                        s3.f4081a = true;
                        z3 = true;
                    }
                }
            }
            if (z3) {
                r rVar = this.f9955a;
                if (rVar.l()) {
                    e(rVar.g().q());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f9955a.l()) {
            return false;
        }
        if (!this.f9961g) {
            this.f9955a.g().q();
        }
        if (this.f9961g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void c(K1.e eVar) {
        m mVar;
        boolean z3;
        z2.h.f(eVar, "observer");
        synchronized (this.f9964j) {
            mVar = (m) this.f9964j.b(eVar);
        }
        if (mVar != null) {
            S s3 = this.f9963i;
            int[] iArr = mVar.f9951b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            s3.getClass();
            z2.h.f(copyOf, "tableIds");
            synchronized (s3) {
                z3 = false;
                for (int i2 : copyOf) {
                    long[] jArr = (long[]) s3.f4082b;
                    long j3 = jArr[i2];
                    jArr[i2] = j3 - 1;
                    if (j3 == 1) {
                        z3 = true;
                        s3.f4081a = true;
                    }
                }
            }
            if (z3) {
                r rVar = this.f9955a;
                if (rVar.l()) {
                    e(rVar.g().q());
                }
            }
        }
    }

    public final void d(C1380b c1380b, int i2) {
        c1380b.e("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f9959e[i2];
        String[] strArr = f9954n;
        for (int i3 = 0; i3 < 3; i3++) {
            String str2 = strArr[i3];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + AbstractC0962n.k(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i2 + " AND invalidated = 0; END";
            z2.h.e(str3, "StringBuilder().apply(builderAction).toString()");
            c1380b.e(str3);
        }
    }

    public final void e(C1380b c1380b) {
        z2.h.f(c1380b, "database");
        if (c1380b.g()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f9955a.f9994i.readLock();
            z2.h.e(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f9965k) {
                    int[] a3 = this.f9963i.a();
                    if (a3 == null) {
                        return;
                    }
                    if (c1380b.i()) {
                        c1380b.b();
                    } else {
                        c1380b.a();
                    }
                    try {
                        int length = a3.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = a3[i2];
                            int i5 = i3 + 1;
                            if (i4 == 1) {
                                d(c1380b, i3);
                            } else if (i4 == 2) {
                                String str = this.f9959e[i3];
                                String[] strArr = f9954n;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + AbstractC0962n.k(str, strArr[i6]);
                                    z2.h.e(str2, "StringBuilder().apply(builderAction).toString()");
                                    c1380b.e(str2);
                                }
                            }
                            i2++;
                            i3 = i5;
                        }
                        c1380b.r();
                        c1380b.d();
                    } catch (Throwable th) {
                        c1380b.d();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        } catch (IllegalStateException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
        }
    }
}
