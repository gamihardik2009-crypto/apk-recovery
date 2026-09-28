package w1;

import android.database.sqlite.SQLiteStatement;

/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387i extends C1386h implements v1.d {

    /* renamed from: i, reason: collision with root package name */
    public final SQLiteStatement f11465i;

    public C1387i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f11465i = sQLiteStatement;
    }

    public final long a() {
        return this.f11465i.executeInsert();
    }

    public final int b() {
        return this.f11465i.executeUpdateDelete();
    }
}
