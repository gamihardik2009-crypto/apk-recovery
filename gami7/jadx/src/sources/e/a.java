package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import z2.h;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(1);

    /* renamed from: h, reason: collision with root package name */
    public final int f7535h;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f7536i;

    public a(Intent intent, int i2) {
        this.f7535h = i2;
        this.f7536i = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f7535h;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f7536i);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h.f(parcel, "dest");
        parcel.writeInt(this.f7535h);
        Intent intent = this.f7536i;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
