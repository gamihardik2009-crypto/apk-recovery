package C0;

/* renamed from: C0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027j {

    /* renamed from: a, reason: collision with root package name */
    public final int f513a;

    public static String a(int i2) {
        if (i2 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i2 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i2 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0027j) {
            return this.f513a == ((C0027j) obj).f513a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f513a);
    }

    public final String toString() {
        return a(this.f513a);
    }
}
